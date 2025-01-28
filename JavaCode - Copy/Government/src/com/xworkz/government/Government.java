package com.xworkz.government;

class Government {
	
    MLA mla;
    Scheme scheme;
    String[] ministers;
    String[] chiefMinister;

    Government(MLA mla,Scheme scheme,String[] ministers,String[] chiefMinister) 
    {
        this.mla = mla;
        this.scheme= scheme;
        this.chiefMinister = chiefMinister;
        this.ministers = ministers;
    }

    public Government(String string, String string2) {
		
	}

	void displayDetails() 
    {
       
        System.out.println("Chief Minister: " + chiefMinister);
        System.out.println("Ministers: ");
        System.out.println("Scheme: ");
        for (String minister : ministers) 
        {
            System.out.println(" - " + minister);
        }
    }
}
