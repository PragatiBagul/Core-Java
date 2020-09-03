import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}

public class CheckBrackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        boolean flag=false;
        int pos=0;
        for (int position = 0; position < text.length(); ++position) 
        {
            char next = text.charAt(position);
            if (next == '(' || next == '[' || next == '{') 
            {
                opening_brackets_stack.push(new Bracket(next,position+1));

            }
            else if (next == ')' || next == ']' || next == '}') 
            {    
                if(!opening_brackets_stack.isEmpty())
                {
                    if(opening_brackets_stack.peek().Match(next))
                    { 
                        opening_brackets_stack.pop();
                        flag=true;
                    }
                    else
                    {
                        //System.out.println(opening_brackets_stack.peek().position);
                        System.out.println(position+1);
                        flag=false;
                        System.exit(0);
                    }
                }
                else{ 
                    flag=false;
                    System.out.println(position+1);
                    System.exit(0);
                }
            }
        }
        if(!opening_brackets_stack.isEmpty())
        {
            System.out.println(opening_brackets_stack.peek().position);
        }
        else if(flag)
        {
            System.out.println("Success");
        }
    }
}
