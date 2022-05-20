package lucrare.dizertatie.server.service.impl;


import lombok.RequiredArgsConstructor;
import lucrare.dizertatie.server.mapper.daodto.TratamentMapper;
import lucrare.dizertatie.server.persistence.repository.TratamentRepository;
import lucrare.dizertatie.server.service.TratamentService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TratamentServiceImpl implements TratamentService {

    private final TratamentRepository tratamentRepository;

    private final TratamentMapper tratamentMapper;

}
