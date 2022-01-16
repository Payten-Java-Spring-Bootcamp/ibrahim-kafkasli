package com.ibrahim.homework3.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@ApiModel(value = "Member Api Entity documentation", description = "Entity")
@Entity
@Table(name = "Member")
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor
@ToString
public class Member implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_Member", allocationSize = 1)
    @GeneratedValue(generator = "seq_Member", strategy = GenerationType.SEQUENCE)
    @ApiModelProperty(value = "unique id of member")
    private Long id;

    @ApiModelProperty(value = "user name of member")
    private String userName;

    @ApiModelProperty(value = "watch list of member")
    private Long watchListId;
}
