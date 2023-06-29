# Features of Dosify(Covid-19-Vaccination-Booking-Application)
---------------------

1. I developed a set of APIs using Spring Boot, following RESTful principles. These APIs allowed users to perform various actions related to user management and vaccination tracking. Some key APIs I implemented include:

2. Add User: Implemented the /add-user endpoint to add a new user to the system by accepting user details and returning the added user's information.

3. Update User: Developed the /update-user endpoint to update the username and mobile number of a user based on their email ID. Provided appropriate response codes and error handling.

4. Vaccination Tracking: Designed APIs to retrieve information about users' vaccination status, such as identifying users who haven't taken a single dose, users who have taken dose1 but not dose2, and users who are fully vaccinated.

5. Gender-based Filtering: Implemented APIs to filter users based on their gender, allowing retrieval of male and female users who haven't taken a single dose or are fully vaccinated.

6. User Deletion: Created an API for deleting a user from the system using the /delete-user endpoint, which required specifying the user ID.


### Some key APIs I implemented for the doctor module include:
--------------
1. Add Doctor: Created the /add-doctor endpoint to add a new doctor to the system by accepting doctor details and returning the added doctor's information. Proper exception handling was implemented to handle cases where the specified center was not present.
2. Doctor Appointment Count: Implemented the /doctor-more-than-appointment endpoint to retrieve a list of doctors who have more than 10 appointments. This API facilitated effective monitoring and management of doctors' workload.
3. Male-Female Ratio: Developed the /male-female-ratio endpoint to calculate and return the ratio of male to female doctors in the system. This API provided valuable insights into the gender distribution among healthcare professionals.
4. Update Doctor Details: Created the /update-doctor endpoint to update the name and mobile number of a doctor based on their email ID. Appropriate response codes and error handling were implemented to handle cases where the specified doctor was not found.
5. These APIs streamlined the process of managing doctors within the COVID-19 Vaccination Booking Application, enabling efficient addition, updating, and analysis of doctor-related data.

### These APIs facilitated efficient management and retrieval of information related to vaccination centers. Some key APIs I implemented for the vaccination center module include:
--------------------------------
1. Add Vaccination Center: Implemented the /add-center endpoint to add a new vaccination center to the system by accepting center details and returning the added center's information. The API utilized proper response handling to ensure the successful creation of a vaccination center.
2. Get Centers of a Particular Center Type: Developed the /particular-center-type endpoint to retrieve a list of all centers of a particular center type. This API allowed users to easily access centers based on specific requirements or preferences.
3. Get Doctors at a Particular Center: Created the /doctor-at-particular-center endpoint to fetch the list of all doctors associated with a specific vaccination center identified by its center ID. The API handled cases where the specified center was not present and returned appropriate response codes and error messages.
4. Get Male and Female Doctors at a Particular Center: Implemented the /male-doctor-at-particular-center and /female-doctor-at-particular-center endpoints to retrieve the lists of male and female doctors, respectively, working at a particular vaccination center. These APIs provided insights into the gender distribution among healthcare professionals at specific centers.
5. Get Male and Female Doctors Above Age 40 at a Particular Center: Developed the /male-doctor-above-age-at-particular-center and /female-doctor-above-age-at-particular-center endpoints to fetch the lists of male and female doctors, respectively, above the age of 40 working at a specific vaccination center. These APIs facilitated targeted analysis and monitoring of doctors based on age and gender.

These APIs greatly enhanced the management and retrieval of vaccination center-related information within the COVID-19 Vaccination Booking Application, providing users with valuable insights and streamlined access to center-specific data.

### One key API I implemented for the appointment module is:
----------------
1. Book Appointment: Developed the /book-appointment endpoint to enable users to book appointments for COVID-19 vaccinations. This API accepted appointment details, such as user information and preferred date/time, and handled the booking process. It utilized proper response handling to return the created appointment's information upon successful booking. In cases where errors occurred during the booking process, appropriate error messages and response codes were returned.
2. The "Book Appointment" API played a crucial role in facilitating the appointment booking process within the COVID-19 Vaccination Booking Application, providing users with a convenient and efficient way to secure their vaccination appointments.

### These APIs allowed users to add and retrieve their vaccination certificates. Two key APIs I implemented for the certification module are:
--------------------------
1. Add Certificate: Implemented the /add-certificate endpoint to enable users to add their vaccination certificates. This API accepted the certificate details, such as the user's information and vaccination details, and facilitated the addition of the certificate to the system. It utilized proper response handling to return the created certificate's information upon successful addition. In cases where errors occurred during the process, appropriate error messages and response codes were returned.
2. Get Certificate: Developed the /get-certificate endpoint to allow users to retrieve their vaccination certificates based on their mobile number and dose number. This API accepted the mobile number and dose number as parameters and retrieved the corresponding certificate from the system. It handled scenarios where the user or certificate was not found, returning the appropriate error messages and response codes.
3. The "Add Certificate" and "Get Certificate" APIs played a crucial role in managing and retrieving vaccination certificates within the COVID-19 Vaccination Booking Application, providing users with a secure and efficient way to store and access their vaccination records.

## To ensure the ease of API testing and documentation, I integrated Swagger, a popular API documentation tool. Additionally, I utilized DTOs (Data Transfer Objects) and transformers to ensure proper data mapping and manipulation within the application.
