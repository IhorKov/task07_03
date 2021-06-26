public enum Color {

    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00"),
    BLACK("#000000"),
    WHITE("#FFFFFF");

    private String str;

    Color(String hex) {
        this.str = hex;
    }

    public String getColor(){
        return str;
    }
}
