namespace libraryCSharp.Model
{
    public class Author
    {
        public string name { get; set; }
        public string email { get; set; }
        public int cpf { get; set; }
    
        //TODO Verificar com o lesley a diferenca dos toStrings
        public override string ToString()
        {
            return base.ToString();
        }
    }
}