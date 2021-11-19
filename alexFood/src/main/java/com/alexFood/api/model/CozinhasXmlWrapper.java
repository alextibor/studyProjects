package com.alexFood.api.model;

import com.alexFood.domain.model.Cozinha;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class CozinhasXmlWrapper {

    @NonNull
    private List<Cozinha> cozinhas;
}
