package phones

class Phone {

    ManufacturerEnum manufacturer
    String model
    String phoneNumber
    String owner
    Date purchased

    static constraints = {
        model(nullable: false, blank: false, size: 1..50)
        manufacturer(nullable: false)
        phoneNumber(nullable: false, blank: false, size: 3..20, unique:true, matches:'[0-9]+')
        purchased(nullable: false)
        owner(blank: true, size: 0..50)
    }
}