public class StarbzDriver {
    public static void main(String[] args) {

// fill in the blank spots below:
/* 
    - size of the Latte (either tall, grande, or venti)
    - The number of pumps of pumpkin sauce
    - The type of milk (2%, whole, oat, or almond)
    - The number of espresso shots
    - Whether it should contain whipped cream or not (true or false)
*/
// tallPSL: tall, 3 pumpkin sauce pumps, almond milk, 3 espresso shots, with whipped cream 
Latte tallPSL = new Latte("tall",3,"almond",3,true);

// ventiPSL: venti, 5 pumpkin sauce pumps, whole milk, 4 espresso shots, without whipped cream 
Latte ventiPSL = new Latte("venti", 5, "whole", 4, false);

Latte ventiPSL2 = new Latte(ventiPSL);

Latte  tallPSL2 = new Latte(tallPSL);

LatteOrder order = new LatteOrder(3);


// no need to change anything here

// add tallPSL to the order
System.out.println(order.addLatte(tallPSL));

// add ventiPSL to the order
System.out.println(order.addLatte(ventiPSL));

// add ventiPSL2 to the order
System.out.println(order.addLatte(ventiPSL2));

// add tallPSL2 to the order – what happens here? 
System.out.println(order.addLatte(tallPSL2));

// are tallPSL and tallPSL2 the same? should be!
System.out.print("are tallPSL and tallPSL2 the same? ");
System.out.println(tallPSL.equals(tallPSL2));
// are tallPSL and ventiPSL the same? shouldn't be...
System.out.print("are tallPSL and ventiPSL the same? ");
System.out.println(tallPSL.equals(ventiPSL));

// Should call order’s toString methods
System.out.println(order);
        
}
}
