class HistoryNode {
    String page;
    HistoryNode next;

    HistoryNode(String page) {
        this.page = page;
        this.next = null;
    }
}

public class BrowserHistory {

    HistoryNode head;

    // Visit New Page
    void visitPage(String page) {
        HistoryNode newNode = new HistoryNode(page);

        if (head == null) {
            head = newNode;
        } else {
            HistoryNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println(page + " Visited");
    }

    // Display Browsing History
    void displayHistory() {
        if (head == null) {
            System.out.println("No History Found");
            return;
        }

        System.out.println("\nBrowsing History:");

        HistoryNode temp = head;

        while (temp != null) {
            System.out.println(temp.page);
            temp = temp.next;
        }
    }

    // Search a Page
    void searchPage(String page) {
        HistoryNode temp = head;

        while (temp != null) {
            if (temp.page.equals(page)) {
                System.out.println(page + " Found");
                return;
            }
            temp = temp.next;
        }

        System.out.println(page + " Not Found");
    }

    // Delete a Page
    void deletePage(String page) {

        if (head == null) {
            System.out.println("History is Empty");
            return;
        }

        // Delete first page
        if (head.page.equals(page)) {
            head = head.next;
            System.out.println(page + " Deleted");
            return;
        }

        HistoryNode temp = head;

        while (temp.next != null) {

            if (temp.next.page.equals(page)) {
                temp.next = temp.next.next;
                System.out.println(page + " Deleted");
                return;
            }

            temp = temp.next;
        }

        System.out.println(page + " Not Found");
    }

    // Count Total Pages
    void countPages() {
        int count = 0;

        HistoryNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Visited Pages = " + count);
    }

    public static void main(String[] args) {

        BrowserHistory history = new BrowserHistory();

        // Visit pages
        history.visitPage("Google");
        history.visitPage("YouTube");
        history.visitPage("Instagram");
        history.visitPage("Facebook");

        // Display history
        history.displayHistory();

        // Search page
        history.searchPage("YouTube");

        // Delete page
        history.deletePage("Instagram");

        // Display history again
        history.displayHistory();

        // Count pages
        history.countPages();
    }
}