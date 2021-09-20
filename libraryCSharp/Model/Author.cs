namespace libraryCSharp.Model
{
    public class Author
    {
        public string name { get; set; }
        public string email { get; set; }
        public int cpf { get; set; }
        
        //TODO IDENTIFICAR A DIFERENCA DOS TO STRINGS
        public override string ToString()
        {
            return $"{nameof(name)}: {name}, {nameof(email)}: {email}, {nameof(cpf)}: {cpf}";
        }
    }
}