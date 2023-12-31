package ru.bordun.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class SubsetDto {

    private List<SegmentDto> segmentDtoList;

}
