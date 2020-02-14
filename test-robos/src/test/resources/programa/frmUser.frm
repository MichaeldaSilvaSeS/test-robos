VERSION 5.00
Begin VB.Form frmUser 
   Caption         =   "Cadastro"
   ClientHeight    =   3030
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   4560
   LinkTopic       =   "Form1"
   ScaleHeight     =   3030
   ScaleWidth      =   4560
   StartUpPosition =   2  'CenterScreen
   Begin VB.CommandButton cmdSalvar 
      Caption         =   "Salvar"
      Height          =   615
      Left            =   3000
      TabIndex        =   2
      Top             =   2160
      Width           =   1335
   End
   Begin VB.TextBox txtNome 
      Height          =   375
      Left            =   1320
      TabIndex        =   1
      Top             =   360
      Width           =   3135
   End
   Begin VB.Label lblNome 
      Caption         =   "Nome"
      Height          =   375
      Left            =   120
      TabIndex        =   0
      Top             =   360
      Width           =   975
   End
End
Attribute VB_Name = "frmUser"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub cmdSalvar_Click()
    MsgBox "Sucesso \o/ " & txtNome.Text, vbInformation, "Operacao"
End Sub

Private Sub Form_Load()
    txtNome.Text = ""
End Sub
