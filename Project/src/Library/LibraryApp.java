package Library;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * 프로그램의 시작점이며, 사용자 입력을 처리하고 결과를 출력하는 클래스입니다.
 * (발표 시연을 위한 UI 역할을 수행합니다.)
 */
public class LibraryApp {
    
    // OOP 원칙: 인터페이스 자료형으로 선언하여 유연성을 확보합니다.
    private LibraryServiceContract service = new LibraryService(); 
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryApp app = new LibraryApp(); // 실행메서드에서 생성자 생성
        app.start(); // start 메서드 사용
    }
    
    public void start() {
        System.out.println("===================================");
        System.out.println(" 📚 도서 관리 시스템 📚");
        System.out.println("====================================");
        
       
        while (true) { // 무한루프로 실행
            printMenu(); 
            String command = scanner.nextLine(); // command에 입력값 저장
            
            if (command.equals("0")) {
                break; // 0 입력 시 실행 종료
            }
            
            processCommand(command); // 입력한 값에 따라 메서드 실행
        }
        System.out.println("\n[👋 종료] 시스템을 종료합니다.");
        scanner.close();
    }

    private void printMenu() { 
        System.out.println("\n--- 핵심 기능 ---");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 대여");
        System.out.println("3. 전체 도서 목록 조회");
        System.out.println("4. 도서 반납");
        System.out.println("0. 종료");
        System.out.print(">>> 명령어 입력: ");
    }

    // 사용자 명령어에 따라 서비스 메서드를 호출합니다.
    private void processCommand(String command) {
        switch (command) {
            case "1":
                registerBook();
                break;
            case "2":
                rentBook();
                break;
            case "3":
                listAllBooks();
                break;
            case "4":
                returnBook();
                break;
            default:
                System.out.println("[⚠️ 경고] 알 수 없는 명령어입니다. 다시 선택해 주세요.");
        }
    }
    
    // [기능 1] 도서 등록 입력 처리
    private void registerBook() {
        System.out.println("\n--- 📚 도서 등록 ---");
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        
        String result = service.registerBook(title, author, isbn);  
        System.out.println(result);
    }

    // [기능 2] 도서 대여 입력 처리
    private void rentBook() {
        System.out.println("\n--- 📤 도서 대여 ---");
        // ID와 제목 모두로 검색 가능함을 안내합니다.
        System.out.print("대여할 도서 ID 또는 제목: "); 
        String searchKey = scanner.nextLine();
        
        String result = service.rentBook(searchKey);
        System.out.println(result);
    }
    
    // [기능 3] 전체 목록 출력 처리
    private void listAllBooks() { 
        System.out.println("\n--- 📖 전체 도서 목록 ---");
        ArrayList<Book> books = service.getAllBooks();
        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }
    
    // [기능 4] 도서 반납 입력 처리
    private void returnBook() {
        System.out.println("\n--- 🔙 도서 반납 ---");
        // ID와 제목 모두로 검색 가능함을 안내합니다.
        System.out.print("반납할 도서 ID 또는 제목: ");
        String searchKey = scanner.nextLine();
        
        String result = service.returnBook(searchKey);
        System.out.println(result);
    }
}