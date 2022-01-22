Question Id : 200301-BOOK-v1-01-002

Which of the following protocols are examples of TCP/IP data-link layer protocols? (Choose two answers.)

    HTTP
    UDP
    IP
    SMTP
    802.11
    Ethernet
    TCP

Correct: 802.11 and Ethernet

Explanation:
Of the incorrect answers, IP is a network layer protocol, TCP and UDP are transport layer protocols, and SMTP and HTTP are application layer protocols.

Overview of the TCP/IP Networking model, pag 72.

---

Question Id : 200301-GB-v1-1-01-02

Which layer of the TCP/IP Model defines end-to-end forwarding of packets?

    The Transport layer
    The Link Layer
    The Application Layer
    The Network Layer

Correct: The Network layer

Explanation:
The TCP/IP Network layer defines the end-to-end routing of data. Also, the term packet (as mentioned in the question) defines the data that the network layer forwards from sending host to destination host.
For the incorrect answers:
The TCP/IP Application layer provides application software with an interface to the network in ways that simplify the interface so that the application can ask the network to deliver data to some destination address.
The TCP/IP Transport layer deals with error recovery, segmentation of large application data blocks for transport, and the reassembly of segmented application data.
The TCP/IP data link layer defines how to deliver data over a particular instance of a particular type of data link, for instance, over a single Ethernet LAN, serial WAN, or Ethernet WAN link. However, it does not define end-to-end routing of data. 

---

Question Id : 200301-BOOK-v1-01-004

The process of TCP on one computer marking a TCP segment as segment 1, and the receiving computer then acknowledging the receipt of TCP segment 1 is an example of what?

    Same-layer interaction
    All of these answers are correct.
    Data encapsulation
    OSI model
    Adjacent-layer interaction

Correct: Same-layer interaction

---

Question Id : 200301-BOOK-v1-01-003

The process of HTTP asking TCP to send some data and making sure that it is received correctly is an example of what?

    Adjacent-layer interaction
    Same-layer interaction
    OSI model
    All of these answers are correct.

Correct: Adjacent-layer interaction

---

Question Id : 200301-GB-v1-1-01-01

IP functions at what layer of the OSI Reference Model?

    Session
    Network
    Physical
    Transport

Correct: Network

Explanation:
The Network layer is responsible for end-to-end delivery of packets. IP running on a router examines the packet's IP destination and compares it to the IP routing table. If needed, it then fragments the packet to go out the outgoing interface. (pag 83 - Comp. OSI and TCP/IP)

---

Question Id : 200301-BOOK-v1-01-007

Which OSI encapsulation term can be used instead of the term frame?

    Layer 3 PDU
    Layer 2 PDU
    Layer 1 PDU
    Layer 5 PDU
    Layer 7 PDU

Correct: Layer 2 PDU

Explanation:
The term frame refers to the data-link (that is, Layer 2) data structure created by a Layer 2 protoco4l. As a result, the matching OSI term for protocol data units (PDUs) mentions that same layer, that is, Layer 2 PDU, or L2PDU. (pg. 8)

---

Question Id : 200301-BOOK-v1-01-005

The process of a web server adding a TCP header to the contents of a web page, followed by adding an IP header and then adding a data-link header and trailer, is an example of what?

    All of these answers are correct.
    Data encapsulation
    OSI model
    Same-layer interaction

Correct: Data encapsulation

---

Question Id : 200301-BOOK-v1-01-006

Which of the following terms is used specifically to identify the entity created when encapsulating data inside data-link layer headers and trailers?

    Packet
    Data
    Frame
    Chunk
    Segment
 
 Correct: Frame

 ---

Question Id : 200301-BOOK-v1-01-001

 Which of the following protocols are examples of TCP/IP transport layer protocols? (Choose two answers.)

    UDP
    TCP
    SMTP
    HTTP
    IP
    Ethernet

Correct: UDP and TCP

Explanation:
Of the incorrect answers, Ethernet defines both physical and data-link protocols, PPP is a data-link protocol, IP is a network layer protocol, and SMTP and HTTP are application layer protocols.

---

Question Id : 200301-LS-v1-1-01-01

Which of the following terms represents L3PDU in the OSI model, which includes the network layer header and its encapsulated data?

    Segment
    Frame
    Packet
    Data

Correct: Packet


