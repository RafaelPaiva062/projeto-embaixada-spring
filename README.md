# Serviços Consulares

## 1. Emissão de Passaportes e Vistos

### Classe: `CadastroPessoa`

#### Métodos:

- **CadastrarPessoaBrasileira** *(Acessível para brasileiros)*  
  Registra dados de brasileiros (nome, CPF, nacionalidade, etc.).

- **CadastrarPessoaEstrangeira** *(Acessível para estrangeiros)*  
  Registra dados de estrangeiros (nome, número do passaporte, país de origem, etc.).

---

### Classe: `EmissaoPassaporte`

#### Métodos:

- **SolicitarPassaporteNormal** *(Acessível para brasileiros)*  
  Solicita passaporte normal para brasileiros.

- **SolicitarPassaporteEmergencia** *(Acessível para brasileiros)*  
  Solicita passaporte de emergência para brasileiros.

- **RenovarPassaporte** *(Acessível para brasileiros)*  
  Renova passaporte de brasileiros.

- **EmitirPassaporteParaMenores** *(Acessível para brasileiros)*  
  Emite passaporte para menores brasileiros.

---

### Classe: `EmissaoVistos`

#### Métodos:

- **EmitirVistoTurismo** *(Acessível para brasileiros e estrangeiros)*  
  Emite visto de turismo para brasileiros e estrangeiros.

- **EmitirVistoNegocios** *(Acessível para brasileiros e estrangeiros)*  
  Emite visto de negócios para brasileiros e estrangeiros.

- **EmitirVistoEstudo** *(Acessível para brasileiros e estrangeiros)*  
  Emite visto de estudo para brasileiros e estrangeiros.

- **EmitirVistoTrabalho** *(Acessível para brasileiros e estrangeiros)*  
  Emite visto de trabalho para brasileiros e estrangeiros.

- **EmitirVistoResidencia** *(Acessível para brasileiros e estrangeiros)*  
  Emite visto de residência para brasileiros e estrangeiros.

- **EmitirVistoTemporario** *(Acessível para brasileiros e estrangeiros)*  
  Emite visto temporário para brasileiros e estrangeiros.

- **EmitirVistoPermanente** *(Acessível para brasileiros e estrangeiros)*  
  Emite visto permanente para brasileiros e estrangeiros.

---

## 2. Registro Civil e Reconhecimento de Documentos

### Classe: `CadastroPessoa`

#### Métodos:

- **CadastrarRegistroBrasileiro** *(Acessível para brasileiros)*  
  Registra nascimento, casamento ou óbito de brasileiros no exterior.

- **CadastrarRegistroEstrangeiro** *(Acessível para estrangeiros)*  
  Registra eventos de nascimento, casamento ou óbito para estrangeiros no Brasil.

---

### Classe: `RegistroCivil`

#### Métodos:

- **RegistrarNascimento** *(Acessível para brasileiros)*  
  Registra nascimento de brasileiros no exterior.

- **RegistrarCasamento** *(Acessível para brasileiros)*  
  Registra casamento de brasileiros no exterior.

- **RegistrarObito** *(Acessível para brasileiros)*  
  Registra óbito de brasileiros no exterior.

---

### Classe: `ReconhecimentoDocumentos`

#### Métodos:

- **AutenticarAssinatura** *(Acessível para brasileiros e estrangeiros)*  
  Autentica assinaturas de brasileiros e estrangeiros.

- **ReconhecerFirma** *(Acessível para brasileiros e estrangeiros)*  
  Reconhece firma de brasileiros e estrangeiros.

- **LegalizarDocumentos** *(Acessível para brasileiros e estrangeiros)*  
  Legaliza documentos de brasileiros e estrangeiros.

- **FazerTraducaoJuramentada** *(Acessível para brasileiros e estrangeiros)*  
  Faz traduções juramentadas de documentos para brasileiros e estrangeiros.

---

## 3. Emissão de Segunda Via e Atendimento a Emergências

### Classe: `CadastroPessoa`

#### Métodos:

- **CadastrarSegundaViaPessoaBrasileira** *(Acessível para brasileiros)*  
  Registra solicitação de segunda via de documentos (passaporte, certidão) para brasileiros.

- **CadastrarSegundaViaPessoaEstrangeira** *(Acessível para estrangeiros)*  
  Registra solicitação de segunda via de documentos (passaporte, certidão) para estrangeiros.

---

### Classe: `EmissaoSegundaVia`

#### Métodos:

- **EmitirSegundaViaPassaporte** *(Acessível para brasileiros)*  
  Emite segunda via de passaporte para brasileiros.

- **EmitirSegundaViaCertidaoNascimento** *(Acessível para brasileiros)*  
  Emite segunda via de certidão de nascimento para brasileiros.

- **EmitirSegundaViaCertidaoCasamento** *(Acessível para brasileiros)*  
  Emite segunda via de certidão de casamento para brasileiros.

- **EmitirSegundaViaCertidaoObito** *(Acessível para brasileiros)*  
  Emite segunda via de certidão de óbito para brasileiros.

---

### Classe: `AtendimentoEmergencias`

#### Métodos:

- **GerenciarRepatriacaoCorpos** *(Acessível para brasileiros)*  
  Gerencia repatriação de corpos de brasileiros.

- **ApoioJuridico** *(Acessível para brasileiros)*  
  Fornece apoio jurídico a brasileiros.

- **DesaparecimentoCidadão** *(Acessível para brasileiros)*  
  Trata do desaparecimento de cidadãos brasileiros.

- **AssistirVitimasCrimes** *(Acessível para brasileiros)*  
  Assiste vítimas de crimes que sejam brasileiros.

- **ApoiarBrasileirosEmHospitais** *(Acessível para brasileiros)*  
  Apoia brasileiros em hospitais no exterior.

---

## 4. Organização Geral e Integração de Serviços

### Classe: `Embaixada`

#### Métodos:

- **IntegrarServicosEmbaixada** *(Acessível para brasileiros e estrangeiros)*  
  Integra todos os serviços disponíveis da embaixada, acessível para brasileiros e estrangeiros.

- **GerenciarCadastroPessoa** *(Acessível para brasileiros e estrangeiros)*  
  Gerencia o cadastro de pessoas (brasileiros ou estrangeiros), interagindo com a classe `CadastroPessoa`.
