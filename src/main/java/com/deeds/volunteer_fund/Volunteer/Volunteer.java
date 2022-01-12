package com.deeds.volunteer_fund.Volunteer;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Volunteer {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
