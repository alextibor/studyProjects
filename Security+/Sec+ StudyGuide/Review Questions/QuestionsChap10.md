Chapter 10 Cloud and Virtualization Security Review Questions

1- Kevin discovered that his web server was being overwhelmed by traffic, causing a CPU bottleneck. Using the interface offered by his cloud service provider, he added another CPU to the server. What term best describes Kevin's action?

A. Elasticity

B. Horizontal scaling

C. Vertical scaling

D. High availability

1. C. This is an example of adding additional capacity to an existing server, which is also known as vertical scaling. Kevin could also have used horizontal scaling by adding additional web servers. Elasticity involves the ability to both add and remove capacity on demand and, though it does describe this scenario, it's not as good a description as vertical scaling. There is no mention of increasing the server's availability.

2- Fran's organization uses a Type I hypervisor to implement an IaaS offering that it sells to customers. Which one of the following security controls is least applicable to this environment?

A. Customers must maintain security patches on guest operating systems.

B. The provider must maintain security patches on the hypervisor.

C. The provider must maintain security patches on the host operating system.

D. Customers must manage security groups to mediate network access to guest operating systems.

2. C. Type I hypervisors, also known as bare-metal hypervisors, run directly on top of the physical hardware and, therefore, do not require a host operating system.

3- In what cloud security model does the cloud service provider bear the most responsibility for implementing security controls?

A. IaaS

B. FaaS

C. PaaS

D. SaaS

3. D. The cloud service provider bears the most responsibility for implementing security controls in an SaaS environment and the least responsibility in an IaaS environment. This is due to the division of responsibilities under the cloud computing shared
responsibility model.

4- Greg would like to find a reference document that describes how to map cloud security controls to different regulatory standards. What document would best assist with this task?

A. CSA CCM

B. NIST SP 500-292

C. ISO 27001

D. PCI DSS

4. A. The Cloud Security Alliance (CSA) Cloud Controls Matrix(CCM) is a reference document designed to help organizations understand the appropriate use of cloud security controls and map those controls to various regulatory standards. NIST SP 500-292 is a reference model for cloud computing and operates at a high level. ISO 27001 is a general standard for cybersecurity, and PCI DSS is a regulatory requirement for organizations involved in processing credit card transactions.

5- Wanda is responsible for a series of seismic sensors placed at remote locations. These sensors have low-bandwidth connections and she would like to place computing power on the sensors to allow them to preprocess data before it is sent back to the cloud. What term best describes this approach?

A. Edge computing

B. Client-server computing

C. Fog computing

D. Thin client computing

5. A. This approach may be described as client-server computing, but that is a general term that describes many different operating environments. The better term to use here is edge computing, which involves placing compute power at the client to allow it to perform preprocessing before sending data back to the cloud. Fog computing is a related concept that uses IoT gateway devices that are located in close physical proximity to the sensors.

6- Which one of the following statements about cloud computing is incorrect? 

A. Cloud computing offers ubiquitous, convenient access.

B. Cloud computing customers store data on hardware that is shared with other customers.

C. Cloud computing customers provision resources through the service provider's sales team.

D. Cloud computing resources are accessed over a network.

6. C. One of the key characteristics of cloud computing is that customers can access resources on-demand with minimal service provider interaction. Cloud customers do not need tocontact a sales representative each time they wish to provision a resource but can normally do so on a self-service basis.

7- Helen designed a new payroll system that she offers to her customers. She hosts the payroll system in AWS and her customers access it through the web. What tier of cloud computing best describes Helen's service?

A. PaaS

B. SaaS

C. FaaS

D. IaaS

7. B. Helen is using IaaS services to create her payroll product. She is then offering that payroll service to her customers as an SaaS solution.

8- Which cloud computing deployment model requires the use of a unifying technology platform to tie together components from different providers?

A. Public cloud

B. Private cloud

C. Community cloud

D. Hybrid cloud

8. D. Hybrid cloud environments blend elements of public, private, and/or community cloud solutions. A hybrid cloud requires the use of technology that unifies the different cloud offerings into a single, coherent platform.

9- Which one of the following would not commonly be available as an IaaS service offering?

A. CRM

B. Storage

C. Networking

D. Computing

9. A. Customer relationship management (CRM) packages offered in the cloud would be classified as software-as-a-service (SaaS), since they are not infrastructure components. Storage, networking, and computing resources are all common IaaS offerings.

10- Which one of the following is not an example of infrastructure as code?

A. Defining infrastructure in JSON

B. Writing code to interact with a cloud provider's API

C. Using a cloud provider's web interface to provision resources

D. Defining infrastructure in YAML

10. C. Infrastructure as code is any approach that automates the provisioning, management, and deprovisioning of cloud resources. Defining resources through JSON or YAML is IaC, as is writing code that interacts with an API. Provisioning resources through a web interface is manual, not automated, and therefore does not qualify as IaC.

11- Brian is selecting a CASB for his organization and he would like to use an approach that interacts with the cloud provider directly. Which CASB approach is most appropriate for his needs?

A. Inline CASB

B. Outsider CASB

C. Comprehensive CASB

D. API-based CASB

11. D. API-based CASB solutions interact directly with the cloud provider through the provider's API. Inline CASB solutions intercept requests between the user and the provider. Outsider and comprehensive are not categories of CASB solutions.

12- In which of the following cloud categories are customers typically charged based on the number of virtual server instances dedicated to their use?

A. IaaS only

B. SaaS only

C. IaaS and PaaS

D. IaaS, SaaS, and PaaS

12. C. Customers are typically charged for server instances in both IaaS environments, where they directly provision those instances, and PaaS environments, where they request the number of servers needed to support their applications. In an SaaS environment, the customer typically has no knowledge of the number of server instances supporting their use.

13- Brian would like to limit the ability of users inside his organization to provision expensive cloud server instances without permission. What type of control would best help him achieve this goal?

A. Resource policy

B. Security group

C. Multifactor authentication

D. Secure web gateway

13. A. Cloud providers offer resource policies that customers may use to limit the actions that users of their accounts may take. Implementing resource policies is a good security practice to limit the damage caused by an accidental command, a compromised account, or a malicious insider.

14- Ursula would like to link the networks in her on-premises datacenter with cloud VPCs in a secure manner. What technology would help her best achieve this goal?

A. Transit gateway

B. HSM

C. VPC endpoint

D. SWG

14. A. Cloud providers offer VPC endpoints that allow the connection of VPCs to each other using the cloud provider's secure network backbone. Cloud transit gateways extend this model even further, allowing the direct interconnection of cloud VPCs with on-premises VLANs for hybrid cloud operations. Secure web gateways (SWGs) provide a layer of application security for cloud-dependent organizations. Hardware security modules (HSMs) are special purpose computing devices that manage encryption keys and also perform cryptographic operations in a highly efficient manner.

15- What component of a virtualization platform is primarily responsible for preventing VM escape attacks?

A. Administrator

B. Guest operating system

C. Host operating system

D. Hypervisor

15. D. Virtual machine (VM) escape vulnerabilities are the most serious issue that can exist in a virtualized environment, particularly when a virtual host runs systems of differing security levels. In an escape attack, the attacker has access to a single virtual host and then manages to leverage that access to intrude upon the resources assigned to a different virtual machine. The hypervisor is supposed to prevent this type of access by restricting a virtual machine's access to only those resources assigned to that machine.

16- Ryan is selecting a new security control to meet his organization's objectives. He would like to use it in their multicloud environment and would like to minimize the administrative work required from his fellow technologists. What approach would best meet his needs?

A. Third-party control

B. Internally developed control

C. Cloud-native control

D. Any of the above

16. A. Controls offered by cloud service providers have the advantage of direct integration with the provider's offerings, often making them cost-effective and user-friendly. Third-party solutions are often more costly, but they bring the advantage of integrating with a variety of cloud providers, facilitating the management of multicloud environments.

17- Kira would like to implement a security control that can implement access restrictions across all of the SaaS solutions used by her organization. What control would best meet her needs?

A. Security group

B. Resource policy

C. CASB

D. SWG

17. C. Cloud access security brokers (CASBs) are designed specifically for this situation: enforcing security controls across cloud providers. A secure web gateway (SWG) may be able to achieve Kira's goal but it would be more difficult to do so. Security groups and resource policies are controls used in IaaS environments.

18- Howard is assessing the legal risks to his organization based upon its handling of PII. The organization is based in the United States, handles the data of customers located in Europe, and stores information in Japanese datacenters. What law would be most important to Howard during his assessment?

A. Japanese law

B. European Union law

C. U.S. law

D. All should have equal weight

18. D. The principle of data sovereignty states that data is subject to the legal restrictions of any jurisdiction where it is collected, stored, or processed. In this case, Howard needs to assess the laws of all three jurisdictions.

19- Brenda's company provides a managed incident response service to its customers. What term best describes this type of service offering?

A. MSP

B. PaaS

C. SaaS

D. MSSP

19. D. Brenda's company is offering a technology service to customers on a managed basis, making it a managed serviceprovider (MSP). However, this service is a security service, so the term managed security service provider (MSSP) is a better description of the situation.

20- Tony purchases virtual machines from Microsoft Azure and uses them exclusively for use by his organization. What model of cloud computing is this?

A. Public cloud

B. Private cloud

C. Hybrid cloud

D. Community cloud

20. A. This is an example of public cloud computing because Tony is using a public cloud provider, Microsoft Azure. The fact that Tony is limiting access to virtual machines to his own organization is not relevant because the determining factor for the cloud model is whether the underlying infrastructure is  shared, not whether virtualized resources are shared.