//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Button button = new Button(new ButtonClickHandler());
//        button.click();
//        Button tvButton = new Button(new EventHandler() {
//            boolean on = false;
//            public void execute() {
//
//                if(on){
//                    System.out.println("Телевизор выключен...");
//                    on=false;
//                }else {
//                    System.out.println("Телевизор включен...");
//                    on=true;
//                }
//            }
//        });
//
//        tvButton.click();
//        tvButton.click();
//    }

        Day current = Day.THURSDAY;
        System.out.println(current);

        Book b1 = new Book();
        b1.name = "War and Peace";
        b1.author = "L. Tolstoy";
        b1.bookType = Type.PHANTASY;

        //вывод всего в перечислении
        Type[] types = Type.values();
        for(Type s : types) System.out.println(s);

        //место в перечислении
        System.out.println(Type.SCIENCE.ordinal());

        System.out.println(Color.GREEN.getCode());

        Operation op = Operation.SUM;
        System.out.println(op.action(15, 5));

    }

    class ButtonClickHandler implements EventHandler {

        public void execute() {

            System.out.println("Кнопка нажата!");
        }
    }

    interface EventHandler {

        void execute();
    }

    class Button {

        EventHandler handler;

        Button(EventHandler action) {

            this.handler = action;
        }

        public void click() {

            handler.execute();
        }
    }
}