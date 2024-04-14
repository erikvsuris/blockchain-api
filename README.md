# API de integração com a blockchain
Projeto de API para integração com a ethereum utilizando Web3j.

### Classe do Smart Contract

Para realizar a criação de uma classe Java equivalente ao Smart Contract em Solidity, é necessário aplicar o seguinte comando no terminal:

$ `web3j generate solidity -b [caminho para o arquivo .bin do Smart Contract] -a [caminho para o arquivo .abi do Smart Contract] -p [package do projeto] -o [caminho para o output da classe]`

Exemplo:

$ `web3j generate solidity -b .\src\main\resources\solidity\AuthLink.bin -a .\src\main\resources\solidity\AuthLink.abi -p com.ages.blockchainapi -o .\src\main\java`

Após a criação da classe, ela não deve ser modificada.