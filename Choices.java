package Bank;

public class Choices {
    private Integer id;
    private String name;
    private Integer value;

    public Choices (Integer id_1, String name, Integer value) {
        this.id = id_1;
        this.value = value;
        this.name = name;
    }

    //---------------------------------------------------------
    // setter for id
    public void setId (Integer id){
        this.id = id;

    }
    //getter for id
    public Integer getId() {
        return this.id;

    }
    //----------------------------------------------------------

   // setter for value
    public void setValue(Integer value) {
        this.value = value;
    }

    //getter for value
    public Integer getValue() {
        return this.value;


    }
   //-----------=------------------------------------------------

   // setter for name
   public void setName(String name) {
       this.name = name;    }


    //getter for name
    public String getName() {
        return this.name;
    }
}

