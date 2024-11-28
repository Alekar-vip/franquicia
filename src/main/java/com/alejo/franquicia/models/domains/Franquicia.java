package com.alejo.franquicia.models.domains;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@NoArgsConstructor
public class Franquicia {

    @NonNull
    String nombre;
}
