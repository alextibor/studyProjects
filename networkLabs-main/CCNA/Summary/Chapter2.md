# Chapter 2 Fundamentals of Ethernet LANs

The standards, defined by the Institute of Electrical and Electronics Engineers (IEEE), define the cabling, the connectors on the ends of the cables, the protocol rules, and everything else required to create an Ethernet LAN.

## Typical SOHO LANs (small office/home office)

A LAN needs a device called an Ethernet LAN switch, which provides many physical ports into which cables can be connected.

![picture 1](../images/23691719c9da71b58f0f3b102a7ef5469d59b9fca544ac66e0f78815cf661fa6.png)

Wireless LANs, defined by the IEEE using standards that begin with 802.11  

## Typical Enterprise LANs

![picture 2](../images/444d76645b27de5e5a8e07dc1bef50225e80250e6a1ab5a8afd798256e7d8d2a.png)

## The Variety of Ethernet Physical Layer Standards

All these Ethernet standards come from the IEEE and include the number 802.3 as the beginning part of the standard name. The IEEE also uses more meaningful shortcut names that identify the speed, as well as a clue about whether the cabling is UTP (with a suffix that includes T) or fiber (with a suffix that includes X).

![picture 3](../images/2387dc0e6eee6cd01b7c610b1d045e9a21ab8744f59c3d20fb8ef22ec1bb19e6.png)  

## Consistent Behavior over All Links Using the Ethernet Data-Link Layer

Although Ethernet includes many physical layer standards, Ethernet acts like a single LAN technology because it uses the same data-link layer standard over all types of Ethernet phys- ical links.

![picture 3](../images/15bc97c4ec2183a4ad759e6df7d11cb3e7589fa04d6fb5a0506832e5f0a88da5.png)

Figure 2-4 shows an example of the process. In this case, PC1 sends an Ethernet frame to PC3. The frame travels over a UTP link to Ethernet switch SW1, then over fiber links to Ethernet switches SW2 and SW3, and finally over another UTP link to PC3. Note that the bits actually travel at four different speeds in this example: 10 Mbps, 1 Gbps, 10 Gbps, and 100 Mbps respectively.

## Building Physical Ethernet LANs with UTP

> Unshielded Twisted Pair (UTP)

## Transmitting Data Using Twisted Pairs

Ethernet sends data over UTP cables that creates eletrical circuits where a electrical signal communicate 1s and 0s.

![picture 4](../images/4f2ebba9a24216047659e12009a6a05df56da6bde76bbc5ed710a06df8d01c5a.png)

## Breaking Down a UTP Ethernet Link

The RJ-45 connector has eight physical locations into which the eight wires in the cable can be inserted, called pin positions, or simply pins.

The 10BASE-T and 100BASE-T standards require two pairs of wires, while the 1000BASE-T standard requires four pairs.

Network interface card (NIC) 

## UTP Cabling Pinouts for 10BASE-T and 100BASE-T

#### Straight-Through Cable Pinout

10BASE-T and 100BASE-T use two pairs of wires in a UTP cable, one for each direction, as shown in Figure 2-9. The figure shows four wires, all of which sit inside a single UTP cable that connects a PC and a LAN switch. In this example, the PC on the left transmits using the top pair, and the switch on the right transmits using the bottom pair.

![picture 4](../images/d941c559d53eadb48150699792e57b88a3c14a5469e78dfbc33648c497eecc67.png)  

As a rule, Ethernet NIC transmitters use the pair connected to pins 1 and 2; the NIC receivers use a pair of wires at pin positions 3 and 6. LAN switches, knowing those facts about what Ethernet NICs do, do the opposite: Their receivers use the wire pair at pins 1 and 2, and their transmitters use the wire pair at pins 3 and 6.

An Ethernet straight-through cable connects the wire at pin 1 on one end of the cable to pin 1 at the other end of the cable; the wire at pin 2 needs to connect to pin 2 on the other end of the cable; pin 3 on one end connects to pin 3 on the other, and so on, as seen in Figure 2-10. Also, it uses the wires in one wire pair at pins 1 and 2, and another pair at pins 3 and 6.

![picture 5](../images/619098bc8e0ca60427498cababc59aed6c94deb7a246fc388cb2084bf83ea8a5.png)  

Figure 2-11 shows one final perspective on the straight-through cable pinout.

![picture 6](../images/ace48ef378ac397fa38e4e0532a58667340e90de35d80094baaaa64e8f44c2a3.png)  

When two like devices connect to an Ethernet link, they both transmit on the same pins. In that case, you then need a crossover cable. The crossover cable pinout crosses the pair at the transmit pins on each device to the receive pins on the opposite device. 

![picture 7](../images/d36c985fdf539d1d28032c2591a5fe02b31f55f7fb7443965fd6ead1d32a88c4.png)

The two switches both transmit on the pair at pins 3 and 6, and they both receive on the pair at pins 1 and 2. So, the cable must connect a pair at pins 3 and 6 on each side to pins 1 and 2 on the other side, connecting to the other node’s receiver logic.

## Choosing the Right Cable Pinouts

The key is to know whether a device acts like a PC NIC, transmitting at pins 1 and 2, or like a switch, transmitting at pins 3 and 6. Then, just apply the following logic:

	Crossover cable: If the endpoints transmit on the same pin pair 
	
	Straight-through cable: If the endpoints transmit on different pin pairs

![picture 8](../images/16e3f88ebeb1f3fddbef7f012c38a884b57ef5224ff918e2dec8af019d45375e.png) 

## UTP Cabling Pinouts for 1000BASE-T

1000BASE-T requires four wire pairs and it uses more advanced electronics that allow both ends to transmit and receive simultaneously on each wire pair. work almost identically to the earlier standards, adding details for the additional two pairs.

![picture 10](../images/804cc1709a7cb449425a47d203cf77dc4e3997fb7d0cabf0b6e26f1e860fc285.png)  

## Building Physical Ethernet LANs with Fiber

### Fiber Cabling Transmission Concepts

Fiber-optic cabling uses fiberglass, as the medium through which light passes, varying that light over time to encode 0s and 1s.

![picture 4](../images/28fa22000783f6f4165bead137456f32ad8de991e4f267d36a3762654af29c56.png)  

The three outer layers of the cable protect the interior of the cable while the inner **cladding** and **core** work together to create the environment to allow transmission of light over the cable. A light source, called the optical transmitter, shines a light into the core. Light can pass through the core; however, light reflects off the cladding back into the core.

![picture 3](../images/c96d82aaa52804442394045539c4b12a67319dd7bf653d8eaadafb286937d51b.png)

The figure shows the normal operation of a multimode fiber characterized by the fact that the cable allows for multiple angles (modes) of light waves entering the core.

In contrast, single-mode fiber uses a smaller-diameter core around one-fifth the diameter of common multimode cables (see Figure 2-17). To transmit light into a much smaller core, a laser-based transmitter sends light at a single angle (hence the name single-mode).

![picture 5](../images/29714493c4146070f78e1536728d3d17fc0e7e6b9997c8dbac61193ad63f22f8.png)  

## Using Fiber with Ethernet

![picture 11](../images/db33ed9fe0c05e50df2c01a3c01e8eaf83e32614e460e4a177c12cc2a4c1fef8.png)  

![picture 12](../images/acde92a42e880e39e955a0cb8c20586ad0cb3afe5ef50a3ac2bba6a22e2b02e7.png)  

## Sending Data in Ethernet Networks

## Ethernet Data-Link Protocols

The Ethernet data-link protocol defines the Ethernet frame: an Ethernet header at the front, the encapsulated data in the middle, and an Ethernet trailer at the end. 

![picture 13](../images/066e92793845ad640068ae8571c0414ed0b90ca93cbcdabb3db4c373ca1ecb2f.png)  

![picture 14](../images/4bb8cfe46c6a8e4ab357cfd4ad53234e5134df9a0461b2e357c06fed746fe0e1.png)

## Ethernet Addressing

Ethernet addresses, also called Media Access Control (MAC) addresses, are 6-byte-long (48-bit-long) binary numbers. For convenience, most computers list MAC addresses as 12-digit hexadecimal numbers.

The IEEE also calls these universal MAC addresses global MAC addresses. Most MAC addresses represent a single NIC or other Ethernet port, so these addresses are often called a unicast Ethernet address.

The manufacturer agrees to give all NICs a MAC address that begins with its assigned 3-byte OUI. The manufacturer also assigns a unique value for the last 3 bytes, a number that manufacturer has never used with that OUI. As a result, the MAC address of every device in the universe is unique.

![picture 15](../images/4c4060deb29b030bc6a25215d0371a88f835521de75f46e87e307f84b7d0d07e.png)  

In addition to unicast addresses, Ethernet also uses group addresses. Group addresses identify more than one LAN interface card. A frame sent to a group address might be delivered to a small set of devices on the LAN, or even to all devices on the LAN. In fact, the IEEE defines two general categories of group addresses for Ethernet:

Broadcast address: Frames sent to this address should be delivered to all devices on the Ethernet LAN. It has a value of FFFF.FFFF.FFFF.

Multicast addresses: Frames sent to a multicast Ethernet address will be copied and forwarded to a subset of the devices on the LAN that volunteers to receive frames sent to a specific multicast address.

![picture 16](../images/e562360947ea121db328f8233b0c1a56df4842708bea1b1940290e3de3311ecb.png)  

## Identifying Network Layer Protocols with the Ethernet Type Field

Basically, the Type field identifies the type of network layer (Layer 3) packet that sits inside the Ethernet frame. For example, a host can send one Ethernet frame with an IPv4 packet and the next Ethernet frame with an IPv6 packet. Each frame would have a different Ethernet Type field value, using the values reserved by the IEEE, as shown in Figure 2-21.

![picture 17](../images/a6f1b04f10d7cf31af830d36b21b5f686ca4e141a6cdaec8be14232db860f2a9.png)  

## Error Detection with FCS

Ethernet, like most data-link protocols, uses a field in the data-link trailer for the purpose of error detection.

The Ethernet Frame Check Sequence (FCS) field in the Ethernet trailer—the only field in the Ethernet trailer—gives the receiving node a way to compare results with the sender, to discover whether errors occurred in the frame. The sender applies a complex math formula to the frame before sending it, storing the result of the formula in the FCS field. The receiver applies the same math formula to the received frame. The receiver then compares its own results with the sender’s results. If the results are the same, the frame did not change; otherwise, an error occurred, and the receiver discards the frame.

## Sending Ethernet Frames with Switches and Hubs

The use of more modern switches allows the use of full-duplex logic, which is much faster and simpler than half-duplex logic, which is required when using hubs.

## Sending in Modern Ethernet LANs Using Full Duplex

![picture 18](../images/55a762fdc952b9251be68e5f1a43edcb7051d5568ac91c2a69e7303bd5240f83.png)  

Full duplex means that that the NIC or switch port has no half-duplex restrictions. So, to understand full duplex, you need to understand half duplex, as follows:

>**Half duplex:** The device must wait to send if it is currently receiving a frame; in other words, it cannot send and receive at the same time.

>**Full duplex:** The device does not have to wait before sending; it can send and receive at the same time.

So, with all PCs and LAN switches, and no LAN hubs, all the nodes can use full duplex. All nodes can send and receive on their port at the same instant in time.

## Using Half Duplex with LAN Hubs

When an electrical signal comes in one hub port, the hub repeats that electrical signal out all other ports (except the incoming port). By doing so, the data reaches all the rest of the nodes connected to the hub, so the data hopefully reaches the correct destination. The hub has no concept of Ethernet frames, of addresses, making decisions based on those addresses, and so on. The downside of using LAN hubs is that if two or more devices transmitted a signal at the same instant, the electrical signal collides and becomes garbled. The hub repeats all received electrical signals, even if it receives multiple signals at the same time.

![picture 5](../images/f9d25ee533a735dfe6401ebdc59702ed645edf26c262c5f100c5b8585d7ff871.png)

If you replace the hub in Figure 2-23 with a LAN switch, the  switch prevents the collision on the left. The switch operates as a Layer 2 device, meaning that it looks at the data-link header and trailer. A switch would look at the MAC addresses, and even if the switch needed to forward both frames to Larry on the left, the switch would send one frame and queue the other frame until the first frame was finished.

Now back to the issue created by the hub’s logic: collisions. To prevent these collisions, the Ethernet nodes must use half-duplex logic instead of full-duplex logic. A problem occurs only when two or more devices send at the same time; half-duplex logic tells the nodes that if someone else is sending, wait before sending.

Nodes that use half-duplex logic actually use a relatively well-known algorithm called carrier sense multiple access with collision detection (CSMA/CD).

CSMA/CD covers these cases as well, as follows:

Step 1. A device with a frame to send listens until the Ethernet is not busy.

Step 2. When the Ethernet is not busy, the sender begins sending the frame.

Step 3. The sender listens while sending to discover whether a collision occurs; collisions might be caused by many reasons including unfortunate timing. If a collision occurs, all currently sending nodes do the following:

	A. They send a jamming signal that tells all nodes that a collision happened.

	B. They independently choose a random time to wait before trying again, to avoid unfortunate timing.

	C. The next attempt starts again at Step 1.

Although most modern LANs do not often use hubs and therefore do not need to use half duplex.

![picture 6](../images/e4d4a76c195fadeac36389a287cd4c3e6caebfc8660d33bec9132fe2682619fa.png)

