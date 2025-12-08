package Library;

import java.util.Scanner;
import java.util.ArrayList;


public class LibraryApp { // 실행 클래스
    
    private LibraryServiceContract service = new LibraryService(); 
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.start();
    }
    
    public void start() { // 시작할 때 나오는 메시지를 출력해주는 메서드
        System.out.println("==========================================");
        System.out.println("	    📚 도서 관리 시스템📚			  ");
        System.out.println("==========================================");
        
        while (true) { // 무한루프
            printMenu(); 
            String command = scanner.nextLine();
            
            if (command.equals("0")) { // 0을 입력하면 프로그램 종료
                break;
            }
            
            processCommand(command);
        }
        System.out.println("\n[👋 종료] 시스템을 종료합니다."); // 0을 입력하면 while문을 나간 뒤 출력
        scanner.close();
    }
    
    private void printMenu() { // 메뉴 출력
        System.out.println("\n 원하는 기능의 번호를 입력해주세요");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 대여");
        System.out.println("3. 전체 도서 목록 조회");
        System.out.println("4. 도서 반납");
        System.out.println("0. 종료");
        System.out.print(">>> 번호입력 : ");
    }

    private void processCommand(String command) { // 입력한 번호에 따라 기능 메서드 기능 수행
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
                System.out.println("[⚠️ 경고] 알 수 없는 명령어입니다. 다시 선택해 주세요."); // 이상한 번호나 그냥 enter를 치면 출력
        }
    }

    private void registerBook() { // 도서 등록 입력 처리
        System.out.println("\n--- 📚 도서 등록 ---");
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        try {
            // [try] 서비스 호출 시 예외가 발생할 가능성이 있음
            service.registerBook(title, author, isbn); // 도서 등록
            // [성공] 예외 없이 실행 완료 시 성공 메시지 출력
            System.out.println("✅ 도서 등록 성공: " + title);
        } catch (BookException e) { // BookException 발생 한다면 
            System.err.println("[❌ 오류] " + e.getMessage()); // 설정했던 오류 메시지 출력
        }
    }

    private void rentBook() { // 도서 대여 입력 처리
        System.out.println("\n--- 📤 도서 대여 ---");
        System.out.print("대여할 도서 ID 또는 제목: ");
        String searchKey = scanner.nextLine(); // searchKey에 ID 또는 제목 저장

        try {
            service.rentBook(searchKey); // 도서 대여하는 메서드 사용
            System.out.println("✅ 도서 대여 성공."); // 정상 대여했다면 출력
        } catch (BookException e) { // 설정했던 BookException 발동하면 오류 메시지 출력
            System.err.println("[❌ 오류] " + e.getMessage()); 
        }
    }

    private void listAllBooks() { // 도서 목록 조회해주는 메서드
        System.out.println("\n--- 📖 전체 도서 목록 ---");
        ArrayList<Book> books = service.getAllBooks(); // 모든 도서 정보를 리스트에 저장
        if (books.isEmpty()) { // 도서 목록이 없다면
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        for (int i = 0; i < books.size(); i++) { // 리스트에 저장된 정보들 하나씩 출력
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    private void returnBook() { // 도서 반납 입력 처리
        System.out.println("\n--- 🔙 도서 반납 ---");
        System.out.print("반납할 도서 ID 또는 제목: ");
        String searchKey = scanner.nextLine(); // 반납할 도서 ID나 제목 입력하면 저장

        try {
            service.returnBook(searchKey); // 반납 처리 메서드 실행
            System.out.println("✅ 도서 반납 성공."); // 정상 처리 된다면 출력
        } catch (BookException e) { // 설정한 오류 발생하면 메시지 출력
            System.err.println("[❌ 오류] " + e.getMessage());
        }
    }
}