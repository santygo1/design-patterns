package com.ds.command;

class SaveTextFieldOperation implements TextFileOperation {

    private final TextField textField;

    public SaveTextFieldOperation(TextField textField) {
        this.textField = textField;
    }

    @Override
    public String execute() {
        return textField.save();
    }
}
