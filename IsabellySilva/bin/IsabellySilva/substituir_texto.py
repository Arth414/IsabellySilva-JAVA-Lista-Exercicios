import os
import glob
import sys
import re

# --- 1. CONFIGURAÇÕES A SEREM AJUSTADAS ---

# ATENÇÃO: Os arquivos .class são binários. Certifique-se de que o TEXTO_ANTIGO 
# E o TEXTO_NOVO têm o MESMO COMPRIMENTO (mesmo número de caracteres), 
# ou a estrutura do arquivo pode ser corrompida!

# O texto exato a ser procurado (o trecho dentro da String do Java)
# ATENÇÃO: Certifique-se de que essa string existe *dentro* do .class file.
TEXTO_ANTIGO = 'Arthur Lucas Versiani'

# O novo texto
TEXTO_NOVO = 'Isabelly Silva Dias'

# O nome deste script para não modificá-lo
NOME_SCRIPT = 'substituir_texto.py' 

# ------------------------------------------

def substituir_em_arquivo_binario(caminho_arquivo):
    """Lê o arquivo .class, substitui o texto e reescreve o conteúdo."""
    
    # 1. Lê o conteúdo do arquivo
    try:
        # Abre o arquivo em modo binário ('rb') para evitar problemas de encoding em bytecode
        with open(caminho_arquivo, 'rb') as f:
            conteudo_bytes = f.read()
    except Exception as e:
        print(f" - [ERRO] Falha ao ler {os.path.basename(caminho_arquivo)}: {e}")
        return 0

    # Converte as strings de busca e substituição para bytes (codificação padrão ASCII ou UTF-8)
    # A codificação deve ser a mesma que o compilador Java usou.
    try:
        antigo_bytes = TEXTO_ANTIGO.encode('utf-8')
        novo_bytes = TEXTO_NOVO.encode('utf-8')
    except Exception as e:
        print(f" - [ERRO] Falha na codificação dos textos: {e}")
        return 0
    
    # 2. Verifica e substitui (usando bytes)
    if antigo_bytes in conteudo_bytes:
        
        # Realiza a substituição na sequência de bytes
        conteudo_novo_bytes = conteudo_bytes.replace(antigo_bytes, novo_bytes)

        # 3. Reescreve o arquivo
        try:
            # Abre o arquivo em modo binário de escrita ('wb')
            with open(caminho_arquivo, 'wb') as f:
                f.write(conteudo_novo_bytes)
            print(f" - [ATUALIZADO] Arquivo .class: {os.path.basename(caminho_arquivo)}")
            return 1
        except Exception as e:
            print(f" - [ERRO] Falha ao escrever {os.path.basename(caminho_arquivo)}: {e}")
            return 0
    
    return 0


def main():
    print("\n************************************************")
    print("INICIANDO SUBSTITUIÇÃO DE TEXTO em arquivos .class")
    print(f"Procurando: '{TEXTO_ANTIGO}'")
    print(f"Substituindo por: '{TEXTO_NOVO}'")
    print("************************************************\n")

    # Obtém o diretório onde o script está (src)
    diretorio_src = os.path.dirname(os.path.abspath(sys.argv[0]))
    
    # Define o diretório alvo: sobe um nível (..) e desce para 'bin'
    diretorio_alvo = os.path.join(os.path.dirname(diretorio_src), "IsabellySilva")
    
    arquivos_atualizados = 0

    print(f"Pasta Alvo para .class: '{diretorio_alvo}'")
    
    # Itera sobre todos os arquivos .class na pasta 'bin'
    padrao_busca = os.path.join(diretorio_alvo, "*.class")
    
    # Itera sobre todos os arquivos encontrados
    for caminho_arquivo in glob.glob(padrao_busca):
        
        # Ignora o próprio script (por precaução)
        if os.path.basename(caminho_arquivo) == NOME_SCRIPT:
            continue
        
        # Chama a função de substituição para arquivos binários
        arquivos_atualizados += substituir_em_arquivo_binario(caminho_arquivo)

    print("\n************************************************")
    print(f"PROCESSO CONCLUÍDO. {arquivos_atualizados} arquivos .class atualizados.")
    print("************************************************")

if __name__ == "__main__":
    main()