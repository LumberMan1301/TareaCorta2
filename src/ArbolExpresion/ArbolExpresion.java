package ArbolExpresion;


class ArbolExpresion{
    char type;              /* 'D' or 'P' */
    int value;                      /* for 'D' */
    ArbolExpresion left, rigth;     /* for 'P' */
    int operator;           /* for 'P' */
    
    public ArbolExpresion(char type, int value, ArbolExpresion left,
                    ArbolExpresion rigth, int operator) {
    
            this.type = type;
            this.value = value;
            this.left = left;
            this.rigth = rigth;
            this.operator = operator;
    }
    public ArbolExpresion(char type, int value, ArbolExpresion left, ArbolExpresion rigth) {
            
            this.type = type;
            this.value = value;
            this.left = left; 
            this.rigth = rigth; 
    }

    public ArbolExpresion(char type, ArbolExpresion left, ArbolExpresion rigth, int operator) {
            this.type = type;
            this.left = left;
            this.rigth = rigth;
            this.operator = operator;
    }       
}