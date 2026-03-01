# 🤖 Tars vs Skynet – Jogo de Adivinhação (Java Console)

Aplicação desenvolvida em Java com foco em experiência do usuário, reutilização de métodos e organização estrutural.

O projeto implementa um jogo de adivinhação com narrativa interativa, personagem auxiliar (Tars), sistema de limites configuráveis e elementos de storytelling.

---

## 🎯 Objetivos do Projeto

- Entregar uma experiência imersiva no console
- Maximizar reutilização de métodos
- Minimizar impacto em futuras refatorações
- Aplicar boas práticas de organização lógica
- Implementar tratamento robusto de exceções

---

## 🧠 Conceitos Aplicados

- Programação estruturada
- Reutilização de funções
- Controle de fluxo com `while`, `switch` e `do-while`
- Tratamento de exceções:
  - `InputMismatchException`
  - `NumberFormatException`
- Geração de números aleatórios (`Random`)
- Manipulação de entrada com `Scanner`
- Controle de estado do jogo
- Simulação de narrativa interativa
- Efeito de impressão pausada (`Thread.sleep`)
- Limpeza de terminal ANSI

---

## 🎮 Funcionamento do Jogo

O jogador deve:

1. Configurar o intervalo de números
2. O sistema gera um número aleatório dentro do intervalo
3. O jogador tenta adivinhar o número
4. O sistema pode:
   - Informar se o chute foi maior ou menor (feedback instável)
   - Simular falha de conexão com a Skynet
5. O jogo termina quando:
   - O jogador acerta
   - O jogador digita `sair`

---

## 🛠 Funcionalidades

- Menu interativo
- Configuração dinâmica de limites
- Validação de intervalo
- Correção automática da ordem dos limites
- Feedback aleatório (simulação de conexão instável)
- Contador de tentativas
- História expandida (Easter Egg – código 1137)
- Sistema de ajuda integrado
- Reinício de partida

---

## 🧩 Estrutura
Main.java

O projeto foi desenvolvido em um único arquivo, com forte divisão lógica por métodos responsáveis por:

- Interface
- Regras de negócio
- Validação
- Narrativa
- Controle do fluxo principal

---

## ▶ Como Executar

Compile:

javac Main.java

Execute:

java Main

---

## 🏆 Diferencial do Projeto

Este projeto não é apenas um jogo de adivinhação.

Ele foi pensado como:

- Exercício de organização de código
- Teste de experiência do usuário no terminal
- Aplicação de reutilização de funções
- Demonstração de controle de fluxo robusto
- Exploração de narrativa interativa em Java puro

---

## 🔐 Easter Egg

Durante o jogo, um número é citado repetidamente:

1137

Ele pode revelar algo a mais...

---

## 🚀 Possíveis Evoluções

- Separação em múltiplas classes
- Implementação de testes unitários
- Sistema de níveis de dificuldade
- Persistência de ranking
- Interface gráfica (JavaFX)
- Versão Web

---
