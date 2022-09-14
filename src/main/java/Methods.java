public class Methods {
    //declare the variables
    String name;

    //create method that returns a string
    public String greeting(String name){

        this.name = name;
        //if name equals alice print hello alice, if name equals Bob print hello bob
        if(name.equalsIgnoreCase("Alice")){
            return "Hello " + name;
        }
        if(name.equalsIgnoreCase("Bob")){
            return "Hello " + name;
        }

        //the input is neither Alice or Bob return nothing.
        return "Who tf are you?";
    }

    //this method doesnt print out the greeting aLiCe because it is case sensitive
    //for names.equal i can add name.equal Ignore case that way it ignores caps 














}
