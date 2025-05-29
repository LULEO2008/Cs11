import java.util.Scanner;

public class Librarysystem {
    static class Book {
        private String title;
        private String author;
        private boolean available;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.available = true;
        }

        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public boolean isAvailable() { return available; }
        public void setAvailable(boolean available) { this.available = available; }
    }

    static class Library {
        private Book book1;
        private Book book2;
        private Book book3;

        public void addBook(int slot, String title, String author) {
            Book newBook = new Book(title, author);
            switch (slot) {
                case 1: book1 = newBook; break;
                case 2: book2 = newBook; break;
                case 3: book3 = newBook; break;
                default:
                    System.out.println("只能添加到1-3号位置");
                    return;
            }
            System.out.println("添加书籍成功: " + title);
        }

        public void displayBooks() {
            System.out.println("当前藏书：");
            printBook(book1);
            printBook(book2);
            printBook(book3);
        }

        private void printBook(Book book) {
            if (book != null) {
                String status = book.isAvailable() ? "可借阅" : "已借出";
                System.out.println(book.getTitle() + " - " + book.getAuthor() + " (" + status + ")");
            }
        }

        public void borrowBook(String title) {
            Book book = findBook(title);
            if (book == null) {
                System.out.println("未找到该书: " + title);
            } else if (!book.isAvailable()) {
                System.out.println("该书已被借出: " + title);
            }else if (book == book1) {
                System.out.println("不能借用这本书: " +"\n 这书太构思了，影响身心健康!!!!!!!!!!!!");
            }
            else {
                book.setAvailable(false);
                System.out.println("借阅成功: " + title);
            }
        }

        public void returnBook(String title) {
            Book book = findBook(title);
            if (book == null) {
                System.out.println("未找到该书: " + title);
            } else if (book.isAvailable()) {
                System.out.println("该书未被借出: " + title);
            } else {
                book.setAvailable(true);
                System.out.println("归还成功: " + title);
            }
        }

        public void getBookInfo(String title) {
            Book book = findBook(title);
            if (book == null) {
                System.out.println("未找到该书: " + title);
            } else {
                String status = book.isAvailable() ? "可借阅" : "已借出";
                System.out.println("书名: " + book.getTitle() + ", 作者: " + book.getAuthor() + ", 状态: " + status);
            }
        }

        private Book findBook(String title) {
            if (book1 != null && book1.getTitle().equals(title)) return book1;
            if (book2 != null && book2.getTitle().equals(title)) return book2;
            if (book3 != null && book3.getTitle().equals(title)) return book3;
            return null;
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(1, "pre-calculus 11", "mapleleaf");
        lib.addBook(1, "world history 11", "mapleleaf");
        lib.addBook(1, "English 11", "mapleleaf");
        lib.addBook(2, "哈利・波特" , "J.K.罗琳");
        lib.addBook(2, "三体", "刘慈欣");
        lib.addBook(2, "红楼梦", "曹雪芹");
        lib.addBook(3, "鬼灭之刃", "吾峠呼世晴");
        lib.addBook(3, "进击的巨人", "諫山創");
        lib.addBook(3, "东京喰种", "石田スイ");
        lib.addBook(3, "咒术回战", "冨樫義博");
        lib.addBook(3, "名侦探柯南", " 青山刚昌");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- 图书馆系统菜单 ---");
            System.out.println("1. 添加书籍");
            System.out.println("2. 显示所有书籍");
            System.out.println("3. 借书");
            System.out.println("4. 还书");
            System.out.println("5. 查询书籍信息");
            System.out.println("0. 退出");


            System.out.print("请选择操作: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 吸收换行

            if (choice == 0) {
                System.out.println("退出系统。");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("请输入添加位置(1-3): ");
                    int slot = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("请输入书名: ");
                    String title = scanner.nextLine();
                    System.out.print("请输入作者: ");
                    String author = scanner.nextLine();
                    lib.addBook(slot, title, author);
                    break;
                case 2:
                    lib.displayBooks();
                    break;
                case 3:
                    System.out.print("请输入要借阅的书名: ");
                    String borrowTitle = scanner.nextLine();
                    lib.borrowBook(borrowTitle);
                    break;
                case 4:
                    System.out.print("请输入要归还的书名: ");
                    String returnTitle = scanner.nextLine();
                    lib.returnBook(returnTitle);
                    break;
                case 5:
                    System.out.print("请输入要查询的书名: ");
                    String infoTitle = scanner.nextLine();
                    lib.getBookInfo(infoTitle);
                    break;

                default:
                    System.out.println("无效选择，请重新输入。");
            }
        }
        scanner.close();
    }
}