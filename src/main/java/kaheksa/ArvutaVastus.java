package kaheksas;

public class ArvutaVastus implements ArvutaVastusLiides {
    String answer = "";
    int remainder;
    char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    
    @Override
    public String arvutus(int number) {
        while (number > 0) {
            remainder = number % 16;
            answer = hex[remainder] + answer;
            number =  number / 16;
        }
        return answer;
    }
}