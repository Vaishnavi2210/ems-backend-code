package net.javaguides.ems.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
  
//instead of coverting employeedto to employeejpaentity and employeejpaentityto employeedto used mapping.

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
	 private Long id;
	 private String firstName;
	 private String lastName;
	 private String email;
	 
	 
}
