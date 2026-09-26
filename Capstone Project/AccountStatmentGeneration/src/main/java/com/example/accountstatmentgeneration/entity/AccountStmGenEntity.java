package com.example.accountstatmentgeneration.entity;


import com.example.accountstatmentgeneration.domain.FileFormat;
import com.example.accountstatmentgeneration.domain.StatementStatus;
import jakarta.persistence.*;
import lombok.*;

import javax.sound.midi.MidiFileFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name ="accountstm_gen")
public class AccountStmGenEntity {

    @Id
    @Column(name = "statement_id")
    private String statementId;
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "account_id")
    private String accountId;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "generated_at")
    private LocalDateTime generatedAt;
    @Enumerated(EnumType.STRING)
    @Column(name = "file_format")
    private FileFormat fileFormat;
    @Column(name = "file_path")
    private String filePath;
    @Enumerated(EnumType.STRING)
    private StatementStatus status;



}
