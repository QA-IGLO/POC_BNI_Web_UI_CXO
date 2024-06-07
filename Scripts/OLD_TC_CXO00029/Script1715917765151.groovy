import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.139.47/ui-onboarding/')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/2_2_span_Pilih produk lain'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/3.1_div_Belum Memiliki Giro'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/3.2_select_Pilih Tujuan Pembukaan RekeningInves_a44001'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/3_4_div_Giro Rupiah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/4.1_div_Pejabat Yang BerwenangADARTPihak Yang D_ecdd34'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/4.2_input_Nama Orang Yang Berwenang_onboardDto._e0a54b'), 
    'Amrudin Effendi Putra')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/4.3_input_Nomor Handphone_onboardDto.authPersonPhone'), 
    '0821378788888')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/4.4_input_Email Personal_onboardDto.authPersonEmail'), 
    'sylvia@ekreasi.com')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/5_input_OTP(One Time Passcode)_field-r4'), '6')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/html_Onboarding          katalonfont-family_26df76'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.1_select_Pilih Bentuk Badan UsahaPTInstansi'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.2_input_Nama Perusahaan'), 
    'Gemilang Usaha Rakyat')

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.3_select_Pilih BidangSektor Usaha'), 
    '6', true)

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.4_input_Tempat Usaha Berdiri'), 
    'Bekasi')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.5_input_Tanggal Usaha Berdiri'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.5_input_Tanggal Usaha Berdiri'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.9_div_15'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.5_input_Tanggal Usaha Berdiri'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_May 2024'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.5_input_Tanggal Usaha Berdiri'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_1'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.6_input_Jumlah Karyawan'), 
    '800')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Indonesia'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.8_div_Tidak'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.9_select_Pilih Kelolaan Dana Pertahun Rp100 j_ced9d8'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/input_Penghasilan Pertahun_onboardDto.annualIncome'), 
    '2000000')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Profil Orang Yang BerwenangEmail Verifi_d1d110'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.11_input_Jumlah Pelanggan'), 
    '900')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.12_input_Persentase Pelanggan Domestik'), 
    '85')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/input_Penghasilan Pertahun_onboardDto.annualIncome'), 
    '20000000')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.1_select_Pilih NegaraIndonesia'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.2_div_Pilih NegaraPilih NegaraIndonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.3_select_Pilih KotaKepulauan SeribuJakarta Pu_905aab'), 
    '298', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.3_select_Pilih KotaKepulauan SeribuJakarta Pu_905aab'), 
    '357', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.6_select_Pilih KecamatanGrogol'), 
    '5784', true)

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Kode Pos'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.7_select_Pilih KelurahanJatipuloKemanggisanKo_4906ba'), 
    '92279', true)

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.8_input_Kode Pos_onboardDto.postalCode'), '11480')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_J'), 'J')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl'), 'Jl')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl_1'), 'Jl.')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl_1_2'), 'Jl. ')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. k'), 'Jl. k')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. ke'), 'Jl. ke')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kem'), 'Jl. kem')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kema'), 'Jl. kema')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. keman'), 'Jl. keman')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemang'), 'Jl. kemang')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemangg'), 'Jl. kemangg')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggi'), 'Jl. kemanggi')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggis'), 'Jl. kemanggis')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisa'), 'Jl. kemanggisa')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan'), 'Jl. kemanggisan')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan_1'), 'Jl. kemanggisan ')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan I'), 'Jl. kemanggisan I')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Il'), 'Jl. kemanggisan Il')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ili'), 'Jl. kemanggisan Ili')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir'), 'Jl. kemanggisan Ilir')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir_1'), 'Jl. kemanggisan Ilir ')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I'), 'Jl. kemanggisan Ilir I')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir II'), 'Jl. kemanggisan Ilir II')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I'), 'Jl. kemanggisan Ilir I')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I_1'), 'Jl. kemanggisan Ilir I ')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I N'), 'Jl. kemanggisan Ilir I N')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No'), 'Jl. kemanggisan Ilir I No')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No_1'), 'Jl. kemanggisan Ilir I No ')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 6'), 'Jl. kemanggisan Ilir I No 6')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No_1'), 'Jl. kemanggisan Ilir I No ')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 7'), 'Jl. kemanggisan Ilir I No 7')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77'), 'Jl. kemanggisan Ilir I No 77')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77_1'), 'Jl. kemanggisan Ilir I No 77 ')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 R'), 'Jl. kemanggisan Ilir I No 77 R')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT'), 
    'Jl. kemanggisan Ilir I No 77 RT')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT_1'), 
    'Jl. kemanggisan Ilir I No 77 RT ')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT 0'), 
    'Jl. kemanggisan Ilir I No 77 RT 0')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT 00'), 
    'Jl. kemanggisan Ilir I No 77 RT 00')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT 001'), 
    'Jl. kemanggisan Ilir I No 77 RT 001')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT 001_1'), 
    'Jl. kemanggisan Ilir I No 77 RT 001 ')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT 001 R'), 
    'Jl. kemanggisan Ilir I No 77 RT 001 R')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT 001 RW'), 
    'Jl. kemanggisan Ilir I No 77 RT 001 RW')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT 001 RW_1'), 
    'Jl. kemanggisan Ilir I No 77 RT 001 RW ')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT 001 RW 0'), 
    'Jl. kemanggisan Ilir I No 77 RT 001 RW 0')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT 001 RW 00'), 
    'Jl. kemanggisan Ilir I No 77 RT 001 RW 00')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/textarea_Jl. kemanggisan Ilir I No 77 RT 00_32ae6e'), 
    'Jl. kemanggisan Ilir I No 77 RT 001 RW 005')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7_10_input_Nomor Telepon Perusahaan'), 
    '62217799999')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7_11.input_Alamat Email Perusahaan_onboardDto.compEmail'), 
    'sylvia@ekreasi.com')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.12_input_Alamat Website Perusahaan'), 
    'www.cahayausaharakyat.com')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.1_input_NPWP_onboardPermitsDto.npwp'), '76678909876789000000000000000000000000')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_8.2_input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_8.2_input_Tempat Dikeluarkan Identitas_onboardP_54807e'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Nomor Akte maksimal 16 digit'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.1_input_NPWP_onboardPermitsDto.npwp'), '1234567890123456')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_8.2_input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_8.2_input_Tempat Dikeluarkan Identitas_onboardP_54807e'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.1_input_NPWP_onboardPermitsDto.npwp'), '123456789012345')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_NPWP harus memiliki 16 digit'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_8.2_input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 
    'Bekasi')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.4_input_Nomor Akte Pengesahan_onboardPermitsD_8b3cf4'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.4_input_Nomor Akte Pengesahan_onboardPermitsD_8b3cf4'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Tanggal PengesahanPrevious MonthMay 202_b1ce52'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Nomor Akte Pengesahan harus diisi'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.4_input_Nomor Akte Pengesahan_onboardPermitsD_8b3cf4'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.5_input_Tanggal Pengesahan_onboardPermitsDto._add01d'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.5_input_Tanggal Pengesahan_onboardPermitsDto._add01d'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.7_input_Nomor Akte PendirianAnggaran Dasar_on_3c9837'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Tanggal Pengesahan harus diisi'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.5_input_Tanggal Pengesahan_onboardPermitsDto._add01d'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_May 2024'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_NPWP harus memiliki 16 digit'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_NPWP harus memiliki 16 digit'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_NPWP harus memiliki 16 digit'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.5_input_Tanggal Pengesahan_onboardPermitsDto._add01d'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_March 2024'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_March 2024'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_NPWP harus memiliki 16 digit'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_NPWP harus memiliki 16 digit'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.1_input_NPWP_onboardPermitsDto.npwp'), '1234567890123456')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.5_input_Tanggal Pengesahan_onboardPermitsDto._add01d'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.5_input_Tanggal Pengesahan_onboardPermitsDto._add01d'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_May 2024'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.5_input_Tanggal Pengesahan_onboardPermitsDto._add01d'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_10111213141516'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_4'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.7_input_Nomor Akte PendirianAnggaran Dasar_on_3c9837'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Nomor Akte Pendirian harus diisi'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Nomor Akte Pendirian harus diisi'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.7_input_Nomor Akte PendirianAnggaran Dasar_on_3c9837'), 
    '5678998767890')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.8_input_Tanggal Pendirian_onboardPermitsDto.f_4006f0'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.8_input_Tanggal Pendirian_onboardPermitsDto.f_4006f0'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Tanggal Pendirian harus diisi'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.8_input_Tanggal Pendirian_onboardPermitsDto.f_4006f0'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.5.1_div_13_tanggalBerdiri'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Nama Notaris harus diisi'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'), 
    'Andri')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.12_input_Nomor Akte Perubahan_onboardPermitsDt_da252c'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.12_input_Nomor Akte Perubahan_onboardPermitsDt_da252c'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.11_input_Tempat Akte Dibuat_onboardPermitsDto._2e8135'), 
    'Bekasi')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.12_input_Nomor Akte Perubahan_onboardPermitsDt_da252c'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.12_input_Nomor Akte Perubahan_onboardPermitsDt_da252c'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.13_input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.12_input_Nomor Akte Perubahan_onboardPermitsDt_da252c'), 
    '56789876556789')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.13_input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.13_input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.13_input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.13_input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.13_input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.13_input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_May 2024'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.5.1_div_13_tanggalBerdiri'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.15_input_Notaris_onboardPermitsDto.notaris'), 'Andris')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.16_input_Nomor Izin Usaha NIB_onboardPermitsD_df6ad9'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/label_Tanggal Pembuatan'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Nomor Ijin Usaha harus diisi'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.16_input_Nomor Izin Usaha NIB_onboardPermitsD_df6ad9'), 
    '13')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8_17_input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'), 
    '')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8_17_input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.21_input_Tanggal Expired_onboardPermitsDto.lic_eb8bef'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Tanggal Pembuatan harus diisi'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8_17_input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.13_input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.13_input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_8.20_div_28'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.21_input_Tanggal Expired_onboardPermitsDto.lic_eb8bef'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Sa'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Sa'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.15_input_Notaris_onboardPermitsDto.notaris'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Next Month'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Next Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Next Month'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_26'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.16_input_Nomor Izin Usaha NIB_onboardPermitsD_df6ad9'), 
    '1234567896543210')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_NIB harus maksimal 13 digit'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.16_input_Nomor Izin Usaha NIB_onboardPermitsD_df6ad9'), 
    '123456789012')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8_17_input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'), 
    '2023-11-27')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8_17_input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Nomor Izin Usaha  NIBNIB harus memiliki_4115f2'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.16_input_Nomor Izin Usaha NIB_onboardPermitsD_df6ad9'), 
    '1234567890123')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div__css-3ff64v'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.delay(5)

WebUI.takeAreaScreenshotAsCheckpoint('5', null)

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.delay(0)

WebUI.takeAreaScreenshotAsCheckpoint('5', null)

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div__css-3ff64v_1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_10.1_button_Inquiry'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/6.8. button_Tidak'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/td_In-house, BI-FAST, Online Transfer, LLG,_fb7c4c'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_10.4_input_User ID Maker_usersDto.makerDto.0.userId'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_10.5_input_Nama User Maker_usersDto.makerDto.0.userName'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/input_Nomor Handphone Maker_usersDto.makerD_e29af1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/input_Alamat Email Maker_usersDto.makerDto.0.email'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/input_Mobile token Maker_usersDto.makerDto._4005db'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_10.4_input_User ID Maker_usersDto.makerDto.0.userId'), 
    'ADI07890')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/_10.5_input_Nama User Maker_usersDto.makerDto.0.userName'), 
    'ADI DIANSYAH')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/input_Nomor Handphone Maker_usersDto.makerD_e29af1'), 
    '08124567890')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/input_Alamat Email Maker_usersDto.makerDto.0.email'), 
    'adi.diansyah@gmail.com')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/input_Mobile token Maker_usersDto.makerDto._4005db'), 
    '4567890987654456789')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Data Cabang tidak tersedia_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Data Cabang tidak tersedia_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Data Cabang tidak tersedia_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Data Cabang tidak tersedia_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Data Cabang tidak tersedia_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Data Cabang tidak tersedia_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_null - null'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_JAKARTA PUSAT - JL. JEND. SUDIRMAN KAV._3d0eb9'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/input_Pilih Jadwal Kunjungan_onboardDto.visitDate'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_22'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Profil Orang Yang Berwenang'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Profil Orang Yang Berwenang'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Selanjutnya_chakra-icon css-onkibi'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Selanjutnya_chakra-icon css-onkibi'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/path'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Email Personal_chakra-button css-1b6elut'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Email Personal_chakra-icon css-onkibi'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Alamat Perusahaan'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Edit_chakra-icon css-onkibi'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Email Personal_chakra-button css-1b6elut'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Edit_chakra-icon css-onkibi_1'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Edit_chakra-icon css-onkibi_1_2'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Email Personal_chakra-button css-1b6elut'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Edit_chakra-icon css-onkibi_1_2_3'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/svg_Edit_chakra-icon css-onkibi_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/html_Onboarding          katalonfont-family_26df76_1'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Edit'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/p_Ringkasan Pengajuan'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/13.3_span_Syarat dan Ketentuan_chakra-checkbox___de1f61'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/p_4. Setiap transaksi atau aktivitas yang d_e6c618'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/p_8. Giro dapat dicairkan atau ditransfer k_d66fc3'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Syarat dan Ketentuan e-FormSyarat dan K_cf2aa5'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Pernyataan1. Giro adalah instrumen keua_e7ca67'))

WebUI.doubleClick(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_1. Giro adalah instrumen keuangan yang _7785af'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Simpan'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/div_Profil Orang Yang BerwenangEmail Verifi_d4f9a3'))

WebUI.click(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

