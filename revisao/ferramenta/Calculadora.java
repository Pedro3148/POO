package revisao.ferramenta;

public class Calculadora {
    
    public int a;
    public int b;
    private String op;

    public String getOperador(){
        return this.op;
    }

    public void setOperador(String operador) throws Exception{
        boolean err = true;
        switch (operador) {
            case "+":
                err = false;                
                break;
            case "-":
                err = false;
                break;
            case "*":
                err = false;
                break;
            case "/":
                err = false;
                break;
        }
        if(err){
            throw new Exception();
        }
        this.op = operador;
    }

    public int operar(){
        int res = 0;
        switch (op) {
            case "+":
                res = this.a + this.b;                
                break;
            case "-":
                res = this.a + this.b;
                break;
            case "*":
                res = this.a + this.b;
                break;
            case "/":
                res = this.a + this.b;
                break;
        }
        return res;
    }
    
}
