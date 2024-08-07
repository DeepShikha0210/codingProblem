class CaseChange{

    void subsets(String input, String out){ //"abc" , ""
        if(input.length() == 0){
            System.out.print("[ " + out + " ] ");
            return;
        }
        String curr = String.valueOf(input.charAt(0));
        String op1 = out + curr.toLowerCase();
        String op2 = out + curr.toUpperCase();
        String inp = input.substring(1);
        subsets(inp, op1);
        subsets(inp, op2);

    }
    public static void main(String[] args){

        CaseChange h= new CaseChange();
        String input = "ab";
        String output = "";
        h.subsets(input, output);
    }
}