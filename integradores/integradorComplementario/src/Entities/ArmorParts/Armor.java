package Entities.ArmorParts;

import Interfaces.ArmorAbilities;

public class Armor implements ArmorAbilities {

    private String primaryColor;
    private String secondaryColor;
    private Integer resistanceLevel;
    private Integer health;
    private Generator generator;
    private Boot[] boots;
    private Glove[] gloves;
    private Console console;
    private Synthesizer synthesizer;

    public Armor() {
    }

    public Armor(String primaryColor, String secondaryColor, Integer resistanceLevel, Integer health, Generator generator, Boot[] boots, Glove[] gloves, Console console, Synthesizer synthesizer) {
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.resistanceLevel = resistanceLevel;
        this.health = health;
        this.generator = generator;
        this.boots = boots;
        this.gloves = gloves;
        this.console = console;
        this.synthesizer = synthesizer;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public Integer getResistanceLevel() {
        return resistanceLevel;
    }

    public void setResistanceLevel(Integer resistanceLevel) {
        this.resistanceLevel = resistanceLevel;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public Boot[] getBoots() {
        return boots;
    }

    public void setBoots(Boot[] boots) {
        this.boots = boots;
    }

    public Glove[] getGloves() {
        return gloves;
    }

    public void setGloves(Glove[] gloves) {
        this.gloves = gloves;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    public Synthesizer getSynthesizer() {
        return synthesizer;
    }

    public void setSynthesizer(Synthesizer synthesizer) {
        this.synthesizer = synthesizer;
    }

    private void consumeEnergy(int intensity, int time, Device device) {
        int energyConsumption = device.getEnergyConsumption() * intensity * time;
        generator.setEnergyLevel(generator.getEnergyLevel() - energyConsumption);
    }

    @Override
    public void walk(int time) {
        consumeEnergy(1, time, boots[0]);
    }

    @Override
    public void run(int time) {
        consumeEnergy(2, time, boots[0]);
    }

    @Override
    public void propel(int time) {
        consumeEnergy(3, time, boots[0]);
    }

    @Override
    public void fly(int time) {
        consumeEnergy(3, time, boots[0]);
        consumeEnergy(2, time, gloves[0]);
    }

    @Override
    public void shoot(int time) {
        consumeEnergy(3, time, gloves[0]);
    }

    @Override
    public void consoleWrite(int time) {
        consumeEnergy(1, time, synthesizer);
    }

    @Override
    public void synthesizerSpeak(int time) {
        consumeEnergy(1, time, synthesizer);
    }
}
