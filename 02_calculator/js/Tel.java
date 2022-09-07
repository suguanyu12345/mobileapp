public class Tel
{
    public static void main(String[] args)
    {
        CellularPhone cp = CellularPhone("132-4567");
        instanceofTest(cp);

        FixedPhone fp = new FixedPhone("987-6543","somewhere");
        instanceofTest(fp);
    }

    public static void instanceofTest(Telephone tel)
    {
        if (tel instanceof Telephone)
        {
            System.out.println("tel is Telephone object.");
        }

        if(tel instanceof CellularPhone)
        {
            System.out.println("tle is fixedPhone object.");
        }

        if(tel instanceof FixedPhone)
        {
            System.out.println("tle is FixedPhone object.");
        }

        System.out.println("-------------")
    }
}