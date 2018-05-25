package ArbolE;

public class Arbol
{
    NodoArbol raiz,actual;
    Pila pila2 = new Pila();
 
    public Arbol()
    {
        raiz=actual=null;
    }
     public void llenar(String c)
     {
         byte o=0;
         Pila pila1=new Pila();
         for(byte i=0;i<c.length();i++)
         {
             {
                 if(c.charAt(i)==40) // paretesis (
                 {
                     if(o==0)
                     {
                         NodoArbol nuevo=new NodoArbol();
                         raiz=actual=nuevo;
                         pila1.meter(actual);
                         o=1;
                     }
                     else
                     {
                             NodoArbol nuevo=new NodoArbol();// crea nodo
                             if(actual.izq==null)
                             {
                                 actual.izq=nuevo;
                             }
                             else
                             {
                                 actual.der=nuevo;
                             }
                             actual=nuevo;
                             pila1.meter(actual);
 
                     }
 
                 }
                 if(c.charAt(i)>=48&&c.charAt(i)<=57)//de 0 a 9
                 {
                      NodoArbol nuevo=new NodoArbol((int)c.charAt(i)-48);
                      if(actual.izq==null)
                      {
                          actual.izq=nuevo;
                      }
                      else
                      {
                          actual.der=nuevo;
                      }
                 }
                 if(c.charAt(i)==43||c.charAt(i)==42||c.charAt(i)==45||c.charAt(i)==47||c.charAt(i)==94)
                 {
                     actual=pila1.sacar();
                     actual.dato=(int)c.charAt(i)-48;
                 }
             }
         }
     }
 
     public void enOrden()
     {
         raiz.re_enorden();
         System.out.println(" ");
     }
 
     public void preOrden()
     {
         raiz.re_preorden();
         System.out.println(" ");
     }
     public void postOrden()
     {
         raiz.re_postorden();
         System.out.println(" ");
     }
     public void opPostorden()
     {
             raiz.op_postorden(pila2);
         System.out.println(pila2.sacarf());
     }
 
}
