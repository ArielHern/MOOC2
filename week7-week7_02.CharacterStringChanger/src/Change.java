public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;

    }
    public String change(String characterString){
        String changed = "";
        for(int i = 0; i < characterString.length(); i++){
            char character = characterString.charAt(i);
            if (character == this.fromCharacter){
                changed += this.toCharacter;
            }else{
                changed += character;
            }
        }
        return changed;
    }

}
