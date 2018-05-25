package ArbolExpresion;

public class MainArbol {

	public static void main(String[] args) {
		 ArbolExpresion ae = new ArbolExpresion('P', new ArbolExpresion ('D', 2, null, null), new ArbolExpresion('P', new ArbolExpresion('P', new ArbolExpresion('D', 3, null, null), new ArbolExpresion('D', 4, null, null), '*'), new ArbolExpresion('D', 9, null, null), '+'), '*' );

	}

}
