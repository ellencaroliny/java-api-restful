# java-api-restful

## Class Diagram
```
mermaid classDiagram
    class Salon {
        +String name
    }

    class Client {
        +String name
        +String phone
    }

    class Section {
        +String icon
        +String description
    }

    class Sections {
        +Section services
        +Section appointments
        +Section employees
        +Section clients
        +Section news
    }

    class System {
        +Salon salon
        +Client client
        +Sections sections
    }

    Salon <-- System
    Client <-- System
    Sections <-- System
    Section <-- Sections
```