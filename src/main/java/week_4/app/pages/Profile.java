package week_4.app.pages;

import java.util.Scanner;

public class Profile extends Page{

    public Profile(Scanner scanner) {
        super(scanner);
        System.out.println("--------------------------");
        System.out.println("Username : " + this.validUser.getUsername());
        System.out.println("Phone number : " + this.validUser.getPhone());
        System.out.println("Address : " + this.validUser.getAddress());
        System.out.println("--------------------------");
        System.out.println("1 - Update profile");
        System.out.println("2 - Back to Landing Page");
        System.out.println("--------------------------");
        this.selection = scanner.nextLine();
        navigate();
    }

    @Override
    public Page navigate() {
        Page page ;
        switch (this.selection){
            case "1" :
                page = new UpdateProfilePage(scanner);
                break;
            case "2" :
                page = new LandingPage(scanner);
                break;
            default:
                page = new Profile(scanner);
        }
        return page;
    }

    public static class UpdateProfilePage extends Page{

        public UpdateProfilePage(Scanner scanner) {
            super(scanner);
            System.out.println("Update username : ");
            this.validUser.setUsername(scanner.nextLine());
            System.out.println("Update phone number : ");
            this.validUser.setPhone(scanner.nextLine());
            System.out.println("Update address: ");
            this.validUser.setAddress(scanner.nextLine());
            System.out.println("Profile updated....");
            System.out.println("----------------------");
            navigate();
        }

        @Override
        public Page navigate() {
            return new Profile(scanner);
        }
    }
}
