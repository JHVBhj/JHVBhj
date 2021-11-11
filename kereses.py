from fajlmegtekintes import inputFile
import os


kereslista=[]
def kereses():
    while True:
        input_keres=input("Melyik fájlba szeretne keresni?:")
        if os.path.isfile("./adatok/"+input_keres):
            inputFile("./adatok/"+input_keres,kereslista)
            input_keres2=input("Irja be a keresendo festmeny nevet: ")
            found = False
            for i in range(len(kereslista)):
                if input_keres2 ==kereslista[i][0]:
                    print(f'{str(input_keres2)};{str(kereslista[i][1])}')
                    found = True
                    break
            if not found:
                print("Nem letezik ilyen nevu festmeny!")
            break
        else:
            igenNem=input("A lista nem létezik. Meg szeretné tekinteni a létezo listákat? i/n: ")
            if igenNem=="n":
                break
            elif igenNem=="i":
                dirlist=os.scandir("./adatok/")
                for i in dirlist:
                    print(i.name)
    input("Menübe való visszatéréshez nyomjon Entert!")