package services;

import persistence.EditorialDAO;

public class EditorialService {

    private final EditorialDAO DAO;

    public EditorialService() {
        DAO = new EditorialDAO();
    }
}
