package com.ds.command;

class OpenTextFieldOperation implements TextFileOperation{

    private final TextField textField;

    public OpenTextFieldOperation(TextField textField) {
        this.textField = textField;
    }

    @Override
    public String execute() {
        return textField.open();
    }

}
