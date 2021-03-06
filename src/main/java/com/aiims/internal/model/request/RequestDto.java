package com.aiims.internal.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestDto {

	private String firstName;
	private String lastName;
	private String address;
	private Integer phoneNumber;
	
	
}
