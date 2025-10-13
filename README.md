# Daspro_Assignment_Selection
Name : Atha Rasya Farras
Nim : 254107020160
Class : 1I

## StudyCase 1
### Algorithm : Library System Entry
{input "Yes" or "No" and select the condition}

### Declaration
studentCard, onlineRegist : string

### Description
input studentCard, onlineRegist ("Yes"/"No")  
IF (studentCard == "Yes" OR onlineRegist == "Yes") THEN  
 print("Access granted")  
ELSE  
 print("Access denied")  
END IF

### FlowChart :

<img width="341" height="751" alt="Untitled Diagram drawio" src="https://github.com/user-attachments/assets/97607f90-99ce-4ad0-b14c-592baddb62fc" />

## StudyCase 2 
### Algorithm : Campus WiFi Access System
{input user type and credits}

### Declaration
userType : string  
credits : integer

### Description
input userType  
IF (userType == "lecturer") THEN  
 print("WiFi access granted (lecturer)")
 
ELSE IF (userType == "student") THEN  
 input credits
 IF (credits >= 12) THEN  
    print("WiFi access granted (active student)")  
 ELSE  
    print("Access denied, credits less than 12")  
 END IF  
  ELSE  
    print("Access denied")  
END IF

### FlowChart : 

<img width="549" height="871" alt="Untitled Diagram" src="https://github.com/user-attachments/assets/4f1f92d3-397d-44dd-9ca0-d07054e61e75" />




