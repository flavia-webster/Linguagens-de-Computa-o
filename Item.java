public class Item 
{
    private String token;
    private String lexema;
    private int id;

    public Item(String token, String lexema, int id) 
    {
        this.token = token;
        this.lexema = lexema;
        this.id = id;
    }

    public Item() {
    }

    public String getToken() 
    {
        return token;
    }

    public String getLexema()
    {
        return lexema;
    }

    public void setLexema(String lexema) 
    {
        this.lexema = lexema;
    }

    public double getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    @Override
    public String toString() 
    {
        return "Produto [token=" + token + ", lexema=" + lexema + ", id=" + id + "]";
    }
}
