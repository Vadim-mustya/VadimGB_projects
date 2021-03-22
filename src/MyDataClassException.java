public class MyDataClassException extends RuntimeException {

    private int row;
    private int col;


    public MyDataClassException(String message, int row, int col) {
        super(message);
        this.row = row;
        this.col = col;
    }

    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
}
