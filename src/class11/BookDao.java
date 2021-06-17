package class11;

public interface BookDao {
    //根据书号查询书单价
    public int findBookPriceIsbn(String isbn);
    //根据书号，使书的库存减一
    public void updateBookStock(String isbn);
}
