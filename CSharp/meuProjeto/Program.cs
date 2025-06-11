class animal
{
    public string nome;
    public int idade;

    public void fazerBarulho()
    {
        Console.WriteLine("O animal faz barulho");
    }
}

class cachorro : animal
{
    public void fazerBarulho()
    {
        Console.WriteLine("O cachorro late");
    }
}