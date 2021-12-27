package com.example.demo.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.peristence.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Table(name="Staffs")

public class staff {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Coloumn (name="first_name")
    private String firstname;
    @Coloumn (name="last_name")
    private String lastname;
    @Coloumn (name="phonenumber")
    private String phonenumber;
    @Coloumn (name="address")
    private String address;
}
